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

public class drn extends dmr implements dmz {
   private static final Codec<ewy> f = mg.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ewy $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<drn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, drn::new));
   public static final ebt b = ebj.aS;
   protected final ewy c;
   private final List<exa> g;
   public static final ffw d = dmr.b(16.0, 0.0, 8.0);
   public static final ImmutableList<jb> e = ImmutableList.of(jb.a, jb.d, jb.c, jb.f, jb.e);

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   protected drn(ewy $$0, eas.d $$1) {
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
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fft.a();
   }

   @Override
   protected boolean f(eat $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(eat $$0) {
      return false;
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return !this.c.a(axh.b);
   }

   @Override
   protected exa b_(eat $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(eat $$0, eat $$1, jb $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dte a_(eat $$0) {
      return dte.a;
   }

   @Override
   protected List<czn> a(eat $$0, ezw.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return fft.a();
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(djm $$0, iv $$1, eat $$2) {
      if (this.c.a(axh.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dmt.eo);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jb $$4 = (jb)var5.next();
            iv $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axh.a)) {
               dmr $$6 = $$0.b_($$1).b() ? dmt.cy : dmt.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dmt.nC)) {
               $$0.b($$1, dmt.ep.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(djn $$0, iv $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   public czn a(@Nullable bxj $$0, djn $$1, iv $$2, eat $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dmt.a.m(), 11);
         return new czn(this.c.a());
      } else {
         return czn.k;
      }
   }

   @Override
   public Optional<awm> ap_() {
      return this.c.j();
   }
}
