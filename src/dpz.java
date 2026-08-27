import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dpz extends dcq {
   public static final MapCodec<dpz> a = b(dpz::new);
   public static final drb b = dqb.a;
   public static final drf<drj> c = dqb.c;

   @Override
   public MapCodec<dpz> a() {
      return a;
   }

   public dpz(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, is.c).a(c, drj.a));
   }

   @Nullable
   @Override
   public dnm a(in $$0, dqh $$1) {
      return null;
   }

   public static dnm a(in $$0, dqh $$1, dqh $$2, is $$3, boolean $$4, boolean $$5) {
      return new dqd($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dnm> dnn<T> a(dad $$0, dqh $$1, dno<T> $$2) {
      return a($$2, dno.k, dqd::a);
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dnm $$5 = $$1.c_($$2);
         if ($$5 instanceof dqd) {
            ((dqd)$$5).k();
         }
      }
   }

   @Override
   public void a(dae $$0, in $$1, dqh $$2) {
      in $$3 = $$1.a($$2.c(b).g());
      dqh $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dqa && $$4.c(dqa.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bpm.b;
      } else {
         return bpm.d;
      }
   }

   @Override
   protected List<csz> a(dqh $$0, eoo.a $$1) {
      dqd $$2 = this.a($$1.a(), in.a($$1.a(erc.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return euf.a();
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      dqd $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : euf.a();
   }

   @Nullable
   private dqd a(czj $$0, in $$1) {
      dnm $$2 = $$0.c_($$1);
      return $$2 instanceof dqd ? (dqd)$$2 : null;
   }

   @Override
   public csz a(dag $$0, in $$1, dqh $$2) {
      return csz.i;
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
