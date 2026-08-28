import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dok extends drd implements dnf {
   public static final MapCodec<dok> a = b(dok::new);
   public static final int b = 2;
   public static final ece c = ebu.au;
   private static final List<Map<jb, fgk>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> fgh.c(dnc.b((double)(4 + $$0 * 2), (double)(7 - $$0 * 2), 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   public dok(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jb.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(ebe $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2.a($$0.c(e)));
      return $$3.a(axe.B);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d.get($$0.c(c)).get($$0.c(e));
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = this.m();
      dka $$2 = $$0.q();
      iv $$3 = $$0.a();

      for (jb $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(e, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == $$0.c(e) && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dka $$0, iv $$1, ebe $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(djx $$0, azx $$1, iv $$2, ebe $$3) {
      return true;
   }

   @Override
   public void a(ars $$0, azx $$1, iv $$2, ebe $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
