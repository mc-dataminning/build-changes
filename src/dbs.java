import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbs implements dat {
   final dbt c;
   final cwp d;
   final String e;
   final dar f;
   final boolean g;
   @Nullable
   private dbd h;

   public dbs(String $$0, dar $$1, dbt $$2, cwp $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dbs(String $$0, dar $$1, dbt $$2, cwp $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dbo<? extends dbs> a() {
      return dbo.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public dar c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<dba>> f() {
      return this.c.c();
   }

   @Override
   public dbd ao_() {
      if (this.h == null) {
         this.h = dbd.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(das $$0, dgi $$1) {
      return this.c.a($$0);
   }

   public cwp a(das $$0, jt.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<dcj> g() {
      return List.of(
         new dcn(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<dcp>map(dba::b).orElse(dcp.c.c)).toList(), new dcp.f(this.d), new dcp.d(cwt.fc))
      );
   }

   public static class a implements dbo<dbs> {
      public static final MapCodec<dbs> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  dar.e.fieldOf("category").orElse(dar.d).forGetter($$0x -> $$0x.f),
                  dbt.b.forGetter($$0x -> $$0x.c),
                  cwp.c.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dbs::new)
      );
      public static final ym<vz, dbs> x = ym.a(dbs.a::a, dbs.a::a);

      @Override
      public MapCodec<dbs> a() {
         return w;
      }

      @Override
      public ym<vz, dbs> b() {
         return x;
      }

      private static dbs a(vz $$0) {
         String $$1 = $$0.p();
         dar $$2 = $$0.b(dar.class);
         dbt $$3 = dbt.c.decode($$0);
         cwp $$4 = cwp.h.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dbs($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(vz $$0, dbs $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dbt.c.encode($$0, $$1.c);
         cwp.h.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
