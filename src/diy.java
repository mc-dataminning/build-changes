import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diy extends dbt {
   public static final MapCodec<diy> a = b(diy::new);
   public static final dpz b = dpy.E;
   private final bnk c = bnh.a(5);

   @Override
   public MapCodec<diy> a() {
      return a;
   }

   public diy(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
      }
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0.B ? null : a($$2, dmq.K, dnu::a);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, crs $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
