import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class det extends dbt {
   public static final MapCodec<det> a = b(det::new);
   protected static final etc b = dch.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0);
   public static final List<id> c = id.a(-2, 0, -2, 2, 1, 2).filter($$0 -> Math.abs($$0.u()) == 2 || Math.abs($$0.w()) == 2).map(id::i).toList();

   @Override
   public MapCodec<det> a() {
      return a;
   }

   protected det(dph.d $$0) {
      super($$0);
   }

   public static boolean a(czg $$0, id $$1, id $$2) {
      return $$0.a_($$1.a((ji)$$2)).a(ave.cp) && $$0.a_($$1.b($$2.u() / 2, $$2.v(), $$2.w() / 2)).a(ave.cq);
   }

   @Override
   protected boolean g_(dpi $$0) {
      return true;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return b;
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      super.a($$0, $$1, $$2, $$3);

      for (id $$4 : c) {
         if ($$3.a(16) == 0 && a($$1, $$2, $$4)) {
            $$1.a(
               kn.t,
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
   protected dim b_(dpi $$0) {
      return dim.c;
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dni($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0.B ? a($$2, dmq.m, dni::a) : null;
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         return bof.b;
      }
   }

   @Nullable
   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      dmo $$3 = $$1.c_($$2);
      if ($$3 instanceof dni) {
         wi $$4 = ((bok)$$3).O_();
         return new bop(($$2x, $$3x, $$4x) -> new cnq($$2x, $$3x, cnh.a($$1, $$2)), $$4);
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }
}
