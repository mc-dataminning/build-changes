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

public class dri extends dmm implements dmu {
   private static final Codec<ewt> f = mg.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ewt $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dri> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dri::new));
   public static final ebo b = ebe.aS;
   protected final ewt c;
   private final List<ewv> g;
   public static final ffr d = dmm.b(16.0, 0.0, 8.0);
   public static final ImmutableList<jb> e = ImmutableList.of(jb.a, jb.d, jb.c, jb.f, jb.e);

   @Override
   public MapCodec<dri> a() {
      return a;
   }

   protected dri(ewt $$0, ean.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : ffo.a();
   }

   @Override
   protected boolean f(eao $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(eao $$0) {
      return false;
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return !this.c.a(axh.b);
   }

   @Override
   protected ewv b_(eao $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(eao $$0, eao $$1, jb $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dsz a_(eao $$0) {
      return dsz.a;
   }

   @Override
   protected List<czk> a(eao $$0, ezr.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return ffo.a();
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, eao $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(djh $$0, iv $$1, eao $$2) {
      if (this.c.a(axh.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dmo.eo);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jb $$4 = (jb)var5.next();
            iv $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axh.a)) {
               dmm $$6 = $$0.b_($$1).b() ? dmo.cy : dmo.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dmo.nC)) {
               $$0.b($$1, dmo.ep.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dji $$0, iv $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }

   @Override
   public czk a(@Nullable bxj $$0, dji $$1, iv $$2, eao $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dmo.a.m(), 11);
         return new czk(this.c.a());
      } else {
         return czk.k;
      }
   }

   @Override
   public Optional<awm> ap_() {
      return this.c.j();
   }
}
