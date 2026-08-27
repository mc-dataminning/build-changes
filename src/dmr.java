import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dmr extends czm {
   public static final MapCodec<dmr> a = b(dmr::new);
   public static final dnt b = dmt.a;
   public static final dnx<dob> c = dmt.c;

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.c).a(c, dob.a));
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return null;
   }

   public static dkg a(ib $$0, dmz $$1, dmz $$2, ih $$3, boolean $$4, boolean $$5) {
      return new dmv($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dkg> dkh<T> a(cwz $$0, dmz $$1, dki<T> $$2) {
      return a($$2, dki.k, dmv::a);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dkg $$5 = $$1.c_($$2);
         if ($$5 instanceof dmv) {
            ((dmv)$$5).k();
         }
      }
   }

   @Override
   public void a(cxa $$0, ib $$1, dmz $$2) {
      ib $$3 = $$1.a($$2.c(b).g());
      dmz $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dms && $$4.c(dms.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bnc.b;
      } else {
         return bnc.d;
      }
   }

   @Override
   protected List<cqk> a(dmz $$0, ela.a $$1) {
      dmv $$2 = this.a($$1.a(), ib.a($$1.a(enf.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return eqh.a();
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      dmv $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : eqh.a();
   }

   @Nullable
   private dmv a(cwf $$0, ib $$1) {
      dkg $$2 = $$0.c_($$1);
      return $$2 instanceof dmv ? (dmv)$$2 : null;
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return cqk.h;
   }

   @Override
   protected dmz a(dmz $$0, dgm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dmz a(dmz $$0, dew $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
