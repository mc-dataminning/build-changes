import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dha extends cum {
   public static final MapCodec<dha> a = b(dha::new);
   public static final dic b = dhc.a;
   public static final dig<dik> c = dhc.c;

   @Override
   public MapCodec<dha> a() {
      return a;
   }

   public dha(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, dik.a));
   }

   @Nullable
   @Override
   public dfd a(ht $$0, dhi $$1) {
      return null;
   }

   public static dfd a(ht $$0, dhi $$1, dhi $$2, hx $$3, boolean $$4, boolean $$5) {
      return new dhe($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dfd> dfe<T> a(csa $$0, dhi $$1, dff<T> $$2) {
      return a($$2, dff.k, dhe::a);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dfd $$5 = $$1.c_($$2);
         if ($$5 instanceof dhe) {
            ((dhe)$$5).j();
         }
      }
   }

   @Override
   public void a(csb $$0, ht $$1, dhi $$2) {
      ht $$3 = $$1.a($$2.c(b).g());
      dhi $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dhb && $$4.c(dhb.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bix.b;
      } else {
         return bix.d;
      }
   }

   @Override
   public List<clj> a(dhi $$0, efd.a $$1) {
      dhe $$2 = this.a($$1.a(), ht.a($$1.a(ehi.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ekk.a();
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      dhe $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ekk.a();
   }

   @Nullable
   private dhe a(crg $$0, ht $$1) {
      dfd $$2 = $$0.c_($$1);
      return $$2 instanceof dhe ? (dhe)$$2 : null;
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return clj.b;
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
