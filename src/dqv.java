import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dqv extends ddm {
   public static final MapCodec<dqv> a = b(dqv::new);
   public static final drx b = dqx.a;
   public static final dsb<dsf> c = dqx.c;

   @Override
   public MapCodec<dqv> a() {
      return a;
   }

   public dqv(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.c).a(c, dsf.a));
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return null;
   }

   public static doi a(io $$0, drd $$1, drd $$2, it $$3, boolean $$4, boolean $$5) {
      return new dqz($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return a($$2, dok.k, dqz::a);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         doi $$5 = $$1.c_($$2);
         if ($$5 instanceof dqz) {
            ((dqz)$$5).k();
         }
      }
   }

   @Override
   public void a(dba $$0, io $$1, drd $$2) {
      io $$3 = $$1.a($$2.c(b).g());
      drd $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dqw && $$4.c(dqw.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bpw.b;
      } else {
         return bpw.d;
      }
   }

   @Override
   protected List<ctq> a(drd $$0, epk.a $$1) {
      dqz $$2 = this.a($$1.a(), io.a($$1.a(erz.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return evc.a();
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      dqz $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : evc.a();
   }

   @Nullable
   private dqz a(daf $$0, io $$1) {
      doi $$2 = $$0.c_($$1);
      return $$2 instanceof dqz ? (dqz)$$2 : null;
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return ctq.i;
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
