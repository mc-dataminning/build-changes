import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class dbt implements dau {
   final dbu c;
   final cwq d;
   final String e;
   final das f;
   final boolean g;
   @Nullable
   private dbe h;

   public dbt(String $$0, das $$1, dbu $$2, cwq $$3, boolean $$4) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
      this.d = $$3;
      this.g = $$4;
   }

   public dbt(String $$0, das $$1, dbu $$2, cwq $$3) {
      this($$0, $$1, $$2, $$3, true);
   }

   @Override
   public dbp<? extends dbt> a() {
      return dbp.a;
   }

   @Override
   public String j() {
      return this.e;
   }

   @Override
   public das c() {
      return this.f;
   }

   @VisibleForTesting
   public List<Optional<dbb>> f() {
      return this.c.c();
   }

   @Override
   public dbe ao_() {
      if (this.h == null) {
         this.h = dbe.a(this.c.c());
      }

      return this.h;
   }

   @Override
   public boolean i() {
      return this.g;
   }

   public boolean a(dat $$0, dgj $$1) {
      return this.c.a($$0);
   }

   public cwq a(dat $$0, jt.a $$1) {
      return this.d.v();
   }

   public int k() {
      return this.c.a();
   }

   public int l() {
      return this.c.b();
   }

   @Override
   public List<dck> g() {
      return List.of(
         new dco(this.c.a(), this.c.b(), this.c.c().stream().map($$0 -> $$0.<dcq>map(dbb::c).orElse(dcq.c.c)).toList(), new dcq.f(this.d), new dcq.d(cwu.fc))
      );
   }

   public static class a implements dbp<dbt> {
      public static final MapCodec<dbt> w = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.STRING.optionalFieldOf("group", "").forGetter($$0x -> $$0x.e),
                  das.e.fieldOf("category").orElse(das.d).forGetter($$0x -> $$0x.f),
                  dbu.b.forGetter($$0x -> $$0x.c),
                  cwq.c.fieldOf("result").forGetter($$0x -> $$0x.d),
                  Codec.BOOL.optionalFieldOf("show_notification", true).forGetter($$0x -> $$0x.g)
               )
               .apply($$0, dbt::new)
      );
      public static final yn<wa, dbt> x = yn.a(dbt.a::a, dbt.a::a);

      @Override
      public MapCodec<dbt> a() {
         return w;
      }

      @Override
      public yn<wa, dbt> b() {
         return x;
      }

      private static dbt a(wa $$0) {
         String $$1 = $$0.p();
         das $$2 = $$0.b(das.class);
         dbu $$3 = dbu.c.decode($$0);
         cwq $$4 = cwq.h.decode($$0);
         boolean $$5 = $$0.readBoolean();
         return new dbt($$1, $$2, $$3, $$4, $$5);
      }

      private static void a(wa $$0, dbt $$1) {
         $$0.a($$1.e);
         $$0.a($$1.f);
         dbu.c.encode($$0, $$1.c);
         cwq.h.encode($$0, $$1.d);
         $$0.a($$1.g);
      }
   }
}
