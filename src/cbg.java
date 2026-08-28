import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cbg<T extends coj> extends cam {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cbg(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cam.a.a));
   }

   @Override
   public boolean b() {
      return this.c.p() == null && !this.c.cR() && this.c.gB() && !this.c.gy().a() && !((aqu)this.c.dO()).c(this.c.do());
   }

   @Override
   public boolean c() {
      return this.c.gB() && !this.c.gy().a() && this.c.dO() instanceof aqu && !((aqu)this.c.dO()).c(this.c.do());
   }

   @Override
   public void a() {
      if (this.c.gB()) {
         coi $$0 = this.c.gy();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gg()) {
            exc $$1 = cej.a(this.c, 15, 4, exc.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(coi $$0) {
      if ($$0.u()) {
         Set<coj> $$1 = Sets.newHashSet();
         List<coj> $$2 = this.c.dO().a(coj.class, this.c.cK().g(16.0), $$1x -> !$$1x.gB() && cok.a($$1x, $$0));
         $$1.addAll($$2);

         for (coj $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
