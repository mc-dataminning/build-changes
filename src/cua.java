import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cua extends cuc {
   private final awt<ctz> a;

   public cua(cuc.a $$0, awt<ctz> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   public void a(cuh $$0, @Nullable dca $$1, List<xe> $$2, cwi $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aks<ctz>> $$4 = this.j($$0).flatMap(ja::e);
      if ($$4.isPresent()) {
         xs $$5 = xe.c(ad.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cuh a(cuc $$0, ja<ctz> $$1) {
      cuh $$2 = new cuh($$0);
      $$2.b(ke.P, $$1);
      return $$2;
   }

   public static void a(cuh $$0, awt<ctz> $$1, ayt $$2) {
      Optional<ja<ctz>> $$3 = lh.am.a($$1, $$2);
      $$3.ifPresent($$1x -> $$0.b(ke.P, $$1x));
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      ja<ctz> $$4 = $$3.a(ke.P);
      if ($$4 != null) {
         ctz $$5 = $$4.a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gI().a(this, $$5.b());
         $$1.b(avz.c.b(this));
         return bqb.b($$3);
      } else {
         return bqb.d($$3);
      }
   }

   @Override
   public int b(cuh $$0) {
      Optional<ja<ctz>> $$1 = this.j($$0);
      return $$1.<Integer>map($$0x -> ((ctz)$$0x.a()).b()).orElse(0);
   }

   private Optional<ja<ctz>> j(cuh $$0) {
      ja<ctz> $$1 = $$0.a(ke.P);
      if ($$1 != null) {
         return Optional.of($$1);
      } else {
         Iterator<ja<ctz>> $$2 = lh.am.c(this.a).iterator();
         return $$2.hasNext() ? Optional.of($$2.next()) : Optional.empty();
      }
   }

   @Override
   public cwk c(cuh $$0) {
      return cwk.i;
   }

   private static void a(dca $$0, cly $$1, ctz $$2) {
      avn $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, avq.c, $$4, 1.0F);
      $$0.a(dxv.B, $$1.ds(), dxv.a.a($$1));
   }
}
