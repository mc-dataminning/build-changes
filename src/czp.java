import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class czp extends cva implements cvh {
   private static final Codec<ecq> f = jy.d
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ecq $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<czp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, czp::new));
   public static final dii b = dhy.aP;
   protected final ecq c;
   private final List<ecs> g;
   public static final ekn d = cva.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<hx> e = ImmutableList.of(hx.a, hx.d, hx.c, hx.f, hx.e);

   @Override
   public MapCodec<czp> a() {
      return a;
   }

   protected czp(ecq $$0, dhh.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public ekn b(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ekk.a();
   }

   @Override
   public boolean e_(dhi $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dhi $$0, ame $$1, ht $$2, ats $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean a_(dhi $$0, crg $$1, ht $$2) {
      return false;
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return !this.c.a(arl.b);
   }

   @Override
   public ecs c_(dhi $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dhi $$0, dhi $$1, hx $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public dbf b_(dhi $$0) {
      return dbf.a;
   }

   @Override
   public List<clj> a(dhi $$0, efd.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return ekk.a();
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((csd)$$1));
      }
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((csd)$$1));
      }
   }

   private boolean a(csa $$0, ht $$1, dhi $$2) {
      if (this.c.a(arl.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cvc.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            hx $$4 = (hx)var5.next();
            ht $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(arl.a)) {
               cva $$6 = $$0.b_($$1).b() ? cvc.co : cvc.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cvc.mW)) {
               $$0.b($$1, cvc.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(csb $$0, ht $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b);
   }

   @Override
   public clj a(@Nullable cdu $$0, csb $$1, ht $$2, dhi $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cvc.a.o(), 11);
         return new clj(this.c.a());
      } else {
         return clj.b;
      }
   }

   @Override
   public Optional<aqq> at_() {
      return this.c.j();
   }
}
