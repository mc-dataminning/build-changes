import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvw extends bsl<cjn> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bvw() {
      super(ImmutableMap.of(bzw.c, bzx.a, bzw.n, bzx.c));
   }

   protected boolean b(apu $$0, cjn $$1) {
      if ($$0.Y() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Y();
         im $$2 = $$1.dP().c(bzw.c).get();
         return $$2.a() == $$0.ae() && $$2.b().a($$1.dk(), 1.73);
      }
   }

   protected void a(apu $$0, cjn $$1, long $$2) {
      bru<cjn> $$3 = $$1.dP();
      $$3.a(bzw.J, $$2);
      $$3.c(bzw.c).ifPresent($$1x -> $$3.a(bzw.n, new bso($$1x.b())));
      $$1.gC();
      this.a($$0, $$1);
      if ($$1.gB()) {
         $$1.gA();
      }
   }

   protected void a(apu $$0, cjn $$1) {
   }

   protected boolean b(apu $$0, cjn $$1, long $$2) {
      Optional<im> $$3 = $$1.dP().c(bzw.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         im $$4 = $$3.get();
         return $$4.a() == $$0.ae() && $$4.b().a($$1.dk(), 1.73);
      }
   }
}
