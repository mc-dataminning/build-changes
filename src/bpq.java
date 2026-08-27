import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bpq extends bpw<bzt> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bnu<? extends bzt> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bpq(bnu<? extends bzt> $$0) {
      this($$0, 1.0F, 2);
   }

   public bpq(bnu<? extends bzt> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(bxh.h, bxi.a, bxh.r, bxi.b, bxh.m, bxi.c, bxh.n, bxi.c, bxh.Z, bxi.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aov $$0, bzt $$1) {
      return $$1.gk() && this.c($$1).isPresent();
   }

   protected void a(aov $$0, bzt $$1, long $$2) {
      bzt $$3 = this.c($$1).get();
      $$1.dO().a(bxh.r, $$3);
      $$3.dO().a(bxh.r, $$1);
      bpy.a($$1, (bog)$$3, this.g, this.h);
      int $$4 = 60 + $$1.eh().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aov $$0, bzt $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         bzt $$3 = this.a($$1);
         return $$3.bx() && $$1.a($$3) && bpy.a($$1.dO(), $$3) && $$2 <= this.j && !$$1.gd() && !$$3.gd();
      }
   }

   protected void c(aov $$0, bzt $$1, long $$2) {
      bzt $$3 = this.a($$1);
      bpy.a($$1, (bog)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dO().b(bxh.r);
            $$3.dO().b(bxh.r);
         }
      }
   }

   protected void d(aov $$0, bzt $$1, long $$2) {
      $$1.dO().b(bxh.r);
      $$1.dO().b(bxh.m);
      $$1.dO().b(bxh.n);
      this.j = 0L;
   }

   private bzt a(bzt $$0) {
      return (bzt)$$0.dO().c(bxh.r).get();
   }

   private boolean b(bzt $$0) {
      bpf<?> $$1 = $$0.dO();
      return $$1.a(bxh.r) && $$1.c(bxh.r).get().ai() == this.f;
   }

   private Optional<? extends bzt> c(bzt $$0) {
      return $$0.dO().c(bxh.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof bzt $$2 && $$0.a($$2) && !$$2.gd()) {
            return true;
         }

         return false;
      }).map(bzt.class::cast);
   }
}
