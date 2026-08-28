import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class djh extends dgh {
   public static final MapCodec<djh> a = b(djh::new);
   protected static final eyx b = dgv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<je> c = je.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(je::j).toList();

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   protected djh(dtz.d $$0) {
      super($$0);
   }

   public static boolean a(dds $$0, je $$1, je $$2) {
      return $$0.a_($$1.a((ki)$$2)).a(aws.cw) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(aws.cx);
   }

   @Override
   protected boolean g_(dua $$0) {
      return true;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return b;
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (je $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               ln.s,
               (double)$$2.u() + 0.5,
               (double)$$2.v() + 2.0,
               (double)$$2.w() + 0.5,
               (double)((float)$$4.u() + $$3.i()) - 0.5,
               (double)((float)$$4.v() - $$3.i() - 1.0F),
               (double)((float)$$4.w() + $$3.i()) - 0.5
            );
         }
      }
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Override
   public dre a(je $$0, dua $$1) {
      return new drz($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0.B ? a($$2, drg.m, drz::a) : null;
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if (!$$1.B) {
         $$3.a($$0.b($$1, $$2));
      }

      return brk.a;
   }

   @Nullable
   @Override
   protected brm b(dua $$0, dds $$1, je $$2) {
      dre $$3 = $$1.c_($$2);
      if ($$3 instanceof drz) {
         xd $$4 = ((brn)$$3).Q_();
         return new brs(($$2x, $$3x, $$4x) -> new crm($$2x, $$3x, crd.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
