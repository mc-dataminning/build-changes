import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dzq extends dlm {
   public static final MapCodec<dzq> a = b(dzq::new);
   public static final eax<ja> b = dzs.a;
   public static final eax<ebb> c = dzs.c;

   @Override
   public MapCodec<dzq> a() {
      return a;
   }

   public dzq(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, ebb.a));
   }

   @Nullable
   @Override
   public dwx a(iu $$0, dzz $$1) {
      return null;
   }

   public static dwx a(iu $$0, dzz $$1, dzz $$2, ja $$3, boolean $$4, boolean $$5) {
      return new dzu($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.l, dzu::a);
   }

   @Override
   public void a(diw $$0, iu $$1, dzz $$2) {
      iu $$3 = $$1.a($$2.c(b).g());
      dzz $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dzr && $$4.c(dzr.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bub.c;
      } else {
         return bub.e;
      }
   }

   @Override
   protected List<cyy> a(dzz $$0, ezc.a $$1) {
      dzu $$2 = this.a($$1.a(), iu.a($$1.a(fbt.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return fez.a();
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      dzu $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fez.a();
   }

   @Nullable
   private dzu a(dib $$0, iu $$1) {
      dwx $$2 = $$0.c_($$1);
      return $$2 instanceof dzu ? (dzu)$$2 : null;
   }

   @Override
   protected dsm a_(dzz $$0) {
      return dsm.a;
   }

   @Override
   protected cyy a(diy $$0, iu $$1, dzz $$2, boolean $$3) {
      return cyy.k;
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
      return false;
   }
}
