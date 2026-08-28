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

public class drb extends dmf implements dmn {
   private static final Codec<ewm> f = mf.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ewm $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<drb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, drb::new));
   public static final ebh b = eax.aS;
   protected final ewm c;
   private final List<ewo> g;
   public static final ffk d = dmf.b(16.0, 0.0, 8.0);
   public static final ImmutableList<ja> e = ImmutableList.of(ja.a, ja.d, ja.c, ja.f, ja.e);

   @Override
   public MapCodec<drb> a() {
      return a;
   }

   protected drb(ewm $$0, eag.d $$1) {
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
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : ffh.a();
   }

   @Override
   protected boolean f(eah $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(eah $$0) {
      return false;
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return !this.c.a(axh.b);
   }

   @Override
   protected ewo b_(eah $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(eah $$0, eah $$1, ja $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dss a_(eah $$0) {
      return dss.a;
   }

   @Override
   protected List<czd> a(eah $$0, ezk.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return ffh.a();
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(dja $$0, iu $$1, eah $$2) {
      if (this.c.a(axh.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dmh.eo);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ja $$4 = (ja)var5.next();
            iu $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axh.a)) {
               dmf $$6 = $$0.b_($$1).b() ? dmh.cy : dmh.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dmh.nC)) {
               $$0.b($$1, dmh.ep.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(djb $$0, iu $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   public czd a(@Nullable bxe $$0, djb $$1, iu $$2, eah $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dmh.a.m(), 11);
         return new czd(this.c.a());
      } else {
         return czd.k;
      }
   }

   @Override
   public Optional<awm> ap_() {
      return this.c.j();
   }
}
