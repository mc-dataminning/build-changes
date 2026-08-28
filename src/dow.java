import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.annotation.Nullable;

public class dow extends drp implements dnr {
   public static final MapCodec<dow> a = b(dow::new);
   public static final int b = 2;
   public static final ecq c = ecg.au;
   private static final List<Map<jc, fgw>> d = IntStream.rangeClosed(0, 2)
      .mapToObj($$0 -> fgt.c(dno.b((double)(4 + $$0 * 2), (double)(7 - $$0 * 2), 12.0).a(0.0, 0.0, (double)($$0 - 5) / 16.0).d()))
      .toList();

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   public dow(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(e, jc.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(ebq $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.a($$0.c(e)));
      return $$3.a(axn.B);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return d.get($$0.c(c)).get($$0.c(e));
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = this.m();
      dkm $$2 = $$0.q();
      iw $$3 = $$0.a();

      for (jc $$4 : $$0.f()) {
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
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == $$0.c(e) && !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e, c);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
