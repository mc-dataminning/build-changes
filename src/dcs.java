import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dcs implements dbt {
   final dct c;
   final cxp d;
   final String e;
   final dbr f;
   final boolean g;
   @Nullable
   private dcd h;

   public dcs(String $$0, dbr $$1, dct $$2, cxp $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dcs(String $$0, dbr $$1, dct $$2, cxp $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dco<? extends dcs> a() {
      return dco.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public dbr c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<dca>> f() {
      return this.c.c();
   }

   @Override
   public dcd ap_() {
      if (this.h == null) {
         this.h = dcd.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(dbs $$0, dhi $$1) {
      return this.c.a($$0);
   }

   public cxp a(dbs $$0, js.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<ddj> g() {
      return List.of(
         new ddn(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<ddp>map(dca::b).orElse(ddp.c.c)).toList(), new ddp.f(this.d), new ddp.d(cxt.fa))
      );
   }

   public static class a implements dco<dcs> {
      public static final MapCodec<dcs> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  dbr.e.fieldOf("category").orElse(dbr.d).forGetter($$0x -> $$0x.f),
                  dct.b.forGetter($$0x -> $$0x.c),
                  cxp.c.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dcs::new)
      );
      public static final zt<xg, dcs> x = zt.a(dcs.a::a, dcs.a::a);

      @Override
      public MapCodec<dcs> a() {
         return w;
      }

      @Override
      public zt<xg, dcs> b() {
         return x;
      }

      private static dcs a(xg $$0) {
         String $$1 = $$0.p();
         dbr $$2 = $$0.b(dbr.class);
         dct $$3 = dct.c.decode($$0);
         cxp $$4 = cxp.h.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dcs($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(xg $$0, dcs $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dct.c.encode($$0, $$1.c);
         cxp.h.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
