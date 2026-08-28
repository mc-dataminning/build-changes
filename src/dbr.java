import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbr implements das {
   final dbs c;
   final cwo d;
   final String e;
   final daq f;
   final boolean g;
   @Nullable
   private dbc h;

   public dbr(String $$0, daq $$1, dbs $$2, cwo $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dbr(String $$0, daq $$1, dbs $$2, cwo $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dbn<? extends dbr> a() {
      return dbn.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public daq c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<daz>> f() {
      return this.c.c();
   }

   @Override
   public dbc ao_() {
      if (this.h == null) {
         this.h = dbc.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(dar $$0, dgh $$1) {
      return this.c.a($$0);
   }

   public cwo a(dar $$0, jt.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<dci> g() {
      return List.of(
         new dcm(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<dco>map(daz::c).orElse(dco.c.c)).toList(), new dco.f(this.d), new dco.d(cws.fc))
      );
   }

   public static class a implements dbn<dbr> {
      public static final MapCodec<dbr> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  daq.e.fieldOf("category").orElse(daq.d).forGetter($$0x -> $$0x.f),
                  dbs.b.forGetter($$0x -> $$0x.c),
                  cwo.c.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dbr::new)
      );
      public static final yn<wa, dbr> x = yn.a(dbr.a::a, dbr.a::a);

      @Override
      public MapCodec<dbr> a() {
         return w;
      }

      @Override
      public yn<wa, dbr> b() {
         return x;
      }

      private static dbr a(wa $$0) {
         String $$1 = $$0.p();
         daq $$2 = $$0.b(daq.class);
         dbs $$3 = dbs.c.decode($$0);
         cwo $$4 = cwo.h.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dbr($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wa $$0, dbr $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dbs.c.encode($$0, $$1.c);
         cwo.h.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
