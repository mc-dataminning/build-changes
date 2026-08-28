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

public class djv extends dff implements dfm {
   private static final Codec<enz> f = lq.c
      .r()
      .comapFlatMap($$0 -> $$0 instanceof enz $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<djv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, djv::new));
   public static final dth b = dsx.aP;
   protected final enz c;
   private final List<eob> g;
   public static final ews d = dff.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jf> e = ImmutableList.of(jf.a, jf.d, jf.c, jf.f, jf.e);

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   protected djv(enz $$0, dsg.d $$1) {
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
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ewp.a();
   }

   @Override
   protected boolean d_(dsh $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dsh $$0, dbj $$1, ja $$2) {
      return false;
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return !this.c.a(awa.b);
   }

   @Override
   protected eob b_(dsh $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dsh $$0, dsh $$1, jf $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dll a_(dsh $$0) {
      return dll.a;
   }

   @Override
   protected List<cua> a(dsh $$0, eqr.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return ewp.a();
   }

   @Override
   protected void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcg)$$1));
      }
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, dff $$3, ja $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcg)$$1));
      }
   }

   private boolean a(dcd $$0, ja $$1, dsh $$2) {
      if (this.c.a(awa.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dfh.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jf $$4 = (jf)var5.next();
            ja $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awa.a)) {
               dff $$6 = $$0.b_($$1).b() ? dfh.co : dfh.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dfh.mW)) {
               $$0.b($$1, dfh.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dce $$0, ja $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b);
   }

   @Override
   public cua a(@Nullable cmh $$0, dce $$1, ja $$2, dsh $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dfh.a.o(), 11);
         return new cua(this.c.a());
      } else {
         return cua.l;
      }
   }

   @Override
   public Optional<ave> as_() {
      return this.c.j();
   }
}
