import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cje extends cjg {
   private static final String a = "instrument";
   private final aqk<cjd> b;

   public cje(cjg.a $$0, aqk<cjd> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public void a(cjl $$0, @Nullable cqb $$1, List<tl> $$2, clc $$3) {
      super.a($$0, $$1, $$2, $$3);
      Optional<aey<cjd>> $$4 = this.d($$0).flatMap(he::e);
      if ($$4.isPresent()) {
         tz $$5 = tl.c(ac.a("instrument", $$4.get().a()));
         $$2.add($$5.a(n.h));
      }
   }

   public static cjl a(cjg $$0, he<cjd> $$1) {
      cjl $$2 = new cjl($$0);
      a($$2, $$1);
      return $$2;
   }

   public static void a(cjl $$0, aqk<cjd> $$1, ash $$2) {
      Optional<he<cjd>> $$3 = jb.an.b($$1).flatMap($$1x -> $$1x.a($$2));
      $$3.ifPresent($$1x -> a($$0, $$1x));
   }

   private static void a(cjl $$0, he<cjd> $$1) {
      qw $$2 = $$0.w();
      $$2.a("instrument", $$1.e().orElseThrow(() -> new IllegalStateException("Invalid instrument")).a().toString());
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      cjl $$3 = $$1.b($$2);
      Optional<? extends he<cjd>> $$4 = this.d($$3);
      if ($$4.isPresent()) {
         cjd $$5 = $$4.get().a();
         $$1.c($$2);
         a($$0, $$1, $$5);
         $$1.gn().a(this, $$5.b());
         $$1.b(apq.c.b(this));
         return bhf.b($$3);
      } else {
         return bhf.d($$3);
      }
   }

   @Override
   public int b(cjl $$0) {
      Optional<? extends he<cjd>> $$1 = this.d($$0);
      return $$1.<Integer>map($$0x -> ((cjd)$$0x.a()).b()).orElse(0);
   }

   private Optional<? extends he<cjd>> d(cjl $$0) {
      qw $$1 = $$0.v();
      if ($$1 != null && $$1.b("instrument", 8)) {
         aez $$2 = aez.a($$1.l("instrument"));
         if ($$2 != null) {
            return jb.an.b(aey.a(jc.C, $$2));
         }
      }

      Iterator<he<cjd>> $$3 = jb.an.c(this.b).iterator();
      return $$3.hasNext() ? Optional.of($$3.next()) : Optional.empty();
   }

   @Override
   public cle c(cjl $$0) {
      return cle.i;
   }

   private static void a(cqb $$0, cca $$1, cjd $$2) {
      apf $$3 = $$2.a().a();
      float $$4 = $$2.c() / 16.0F;
      $$0.a($$1, $$1, $$3, aph.c, $$4, 1.0F);
      $$0.a(djn.B, $$1.dj(), djn.a.a($$1));
   }
}
