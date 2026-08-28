import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import java.util.List;
import javax.annotation.Nullable;

public class ftn {
   private final Reference2ObjectMap<csn, ftn.a> a = new Reference2ObjectArrayMap();
   private final ftw b;

   public ftn(ftw $$0) {
      this.b = $$0;
   }

   public void a() {
      this.a.clear();
   }

   public void a(cvl $$0, csn $$1) {
      this.a.put($$1, new ftn.a(List.of($$0), true));
   }

   public void a(List<cvl> $$0, csn $$1) {
      this.a.put($$1, new ftn.a($$0, false));
   }

   public void a(fjn $$0, fib $$1, int $$2, int $$3, boolean $$4) {
      this.a.forEach(($$5, $$6) -> {
         int $$7 = $$5.e + $$2;
         int $$8 = $$5.f + $$3;
         if ($$6.b && $$4) {
            $$0.a($$7 - 4, $$8 - 4, $$7 + 20, $$8 + 20, 822018048);
         } else {
            $$0.a($$7, $$8, $$7 + 16, $$8 + 16, 822018048);
         }

         cvl $$9 = $$6.a(this.b.currentIndex());
         $$0.b($$9, $$7, $$8);
         $$0.a(ghe.K(), $$7, $$8, $$7 + 16, $$8 + 16, 822083583);
         if ($$6.b) {
            $$0.a($$1.h, $$9, $$7, $$8);
         }
      });
   }

   public void a(fjn $$0, fib $$1, int $$2, int $$3, @Nullable csn $$4) {
      if ($$4 != null) {
         ftn.a $$5 = (ftn.a)this.a.get($$4);
         if ($$5 != null) {
            cvl $$6 = $$5.a(this.b.currentIndex());
            $$0.a($$1.h, fpt.a($$1, $$6), $$2, $$3);
         }
      }
   }

   static record a(List<cvl> a, boolean b) {

      public cvl a(int $$0) {
         int $$1 = this.a.size();
         return $$1 == 0 ? cvl.k : this.a.get($$0 % $$1);
      }
   }
}
