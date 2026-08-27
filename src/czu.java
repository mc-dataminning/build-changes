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

public class czu extends cvf implements cvm {
   private static final Codec<ecv> f = kc.d
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ecv $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<czu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, czu::new));
   public static final din b = did.aP;
   protected final ecv c;
   private final List<ecx> g;
   public static final eks d = cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ib> e = ImmutableList.of(ib.a, ib.d, ib.c, ib.f, ib.e);

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   protected czu(ecv $$0, dhm.d $$1) {
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
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ekp.a();
   }

   @Override
   public boolean e_(dhn $$0) {
      return $$0.u().f();
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return false;
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return !this.c.a(arp.b);
   }

   @Override
   public ecx c_(dhn $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   public boolean a(dhn $$0, dhn $$1, ib $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.a;
   }

   @Override
   public List<clo> a(dhn $$0, efi.a $$1) {
      return Collections.emptyList();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return ekp.a();
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((csi)$$1));
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((csi)$$1));
      }
   }

   private boolean a(csf $$0, hx $$1, dhn $$2) {
      if (this.c.a(arp.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(cvh.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ib $$4 = (ib)var5.next();
            hx $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(arp.a)) {
               cvf $$6 = $$0.b_($$1).b() ? cvh.co : cvh.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(cvh.mW)) {
               $$0.b($$1, cvh.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(csg $$0, hx $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public clo a(@Nullable cdz $$0, csg $$1, hx $$2, dhn $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, cvh.a.o(), 11);
         return new clo(this.c.a());
      } else {
         return clo.b;
      }
   }

   @Override
   public Optional<aqu> av_() {
      return this.c.j();
   }
}
