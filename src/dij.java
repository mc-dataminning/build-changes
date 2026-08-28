import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dij extends dgv {
   public static final MapCodec<dij> a = b(dij::new);
   public static final dur b = duq.w;
   public static final dur c = duq.r;

   @Override
   protected MapCodec<? extends dij> a() {
      return a;
   }

   public dij(dtz.d $$0) {
      super($$0);
      this.l(this.o().b(c, Boolean.valueOf(false)).b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof arg $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if ($$1 instanceof arg $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dua $$0, arg $$1, je $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dua $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? awd.fH : awd.fI, awe.e);
         }

         $$1.a($$2, $$4.b(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
