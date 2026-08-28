import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class can extends cbi {
   private static final int i = 2;
   private static final int j = 32;
   private static final int k = 10;
   private static final int l = 7;

   public can(btw $$0, double $$1) {
      super($$0, $$1, 240, false);
   }

   @Nullable
   @Override
   protected evp h() {
      float $$0 = this.b.dP().z.i();
      if (this.b.dP().z.i() < 0.3F) {
         return this.k();
      } else {
         evp $$1;
         if ($$0 < 0.7F) {
            $$1 = this.l();
            if ($$1 == null) {
               $$1 = this.m();
            }
         } else {
            $$1 = this.m();
            if ($$1 == null) {
               $$1 = this.l();
            }
         }

         return $$1 == null ? this.k() : $$1;
      }
   }

   @Nullable
   private evp k() {
      return cel.a(this.b, 10, 7);
   }

   @Nullable
   private evp l() {
      are $$0 = (are)this.b.dP();
      List<cmi> $$1 = $$0.a(bsy.bj, this.b.cK().g(32.0), this::a);
      if ($$1.isEmpty()) {
         return null;
      } else {
         cmi $$2 = $$1.get(this.b.dP().z.a($$1.size()));
         evp $$3 = $$2.dn();
         return cel.a(this.b, 10, 7, $$3);
      }
   }

   @Nullable
   private evp m() {
      kb $$0 = this.n();
      if ($$0 == null) {
         return null;
      } else {
         iz $$1 = this.a($$0);
         return $$1 == null ? null : cel.a(this.b, 10, 7, evp.c($$1));
      }
   }

   @Nullable
   private kb n() {
      are $$0 = (are)this.b.dP();
      List<kb> $$1 = kb.a(kb.a(this.b), 2).filter($$1x -> $$0.b($$1x) == 0).collect(Collectors.toList());
      return $$1.isEmpty() ? null : $$1.get($$0.z.a($$1.size()));
   }

   @Nullable
   private iz a(kb $$0) {
      are $$1 = (are)this.b.dP();
      cer $$2 = $$1.y();
      List<iz> $$3 = $$2.c($$0x -> true, $$0.q(), 8, cer.b.b).map(ces::f).collect(Collectors.toList());
      return $$3.isEmpty() ? null : $$3.get($$1.z.a($$3.size()));
   }

   private boolean a(cmi $$0) {
      return $$0.a(this.b.dP().Z());
   }
}
