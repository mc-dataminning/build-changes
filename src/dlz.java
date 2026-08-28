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

public class dlz extends dhj implements dhq {
   private static final Codec<eqn> f = lu.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eqn $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dlz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dlz::new));
   public static final dvo b = dve.aP;
   protected final eqn c;
   private final List<eqp> g;
   public static final ezm d = dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jj> e = ImmutableList.of(jj.a, jj.d, jj.c, jj.f, jj.e);

   @Override
   public MapCodec<dlz> a() {
      return a;
   }

   protected dlz(eqn $$0, dun.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : ezj.a();
   }

   @Override
   protected boolean f(duo $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      $$0.y().b($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(duo $$0) {
      return false;
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return !this.c.a(awz.b);
   }

   @Override
   protected eqp b_(duo $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(duo $$0, duo $$1, jj $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dnq a_(duo $$0) {
      return dnq.a;
   }

   @Override
   protected List<cvp> a(duo $$0, etk.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return ezj.a();
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dej)$$1));
      }
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$0.y().b() || $$2.y().b()) {
         $$3.a($$4, $$0.y().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((dej)$$1));
      }
   }

   private boolean a(deg $$0, je $$1, duo $$2) {
      if (this.c.a(awz.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dhl.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jj $$4 = (jj)var5.next();
            je $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awz.a)) {
               dhj $$6 = $$0.b_($$1).b() ? dhl.co : dhl.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dhl.mW)) {
               $$0.b($$1, dhl.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(deh $$0, je $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b);
   }

   @Override
   public cvp a(@Nullable cnu $$0, deh $$1, je $$2, duo $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dhl.a.o(), 11);
         return new cvp(this.c.a());
      } else {
         return cvp.k;
      }
   }

   @Override
   public Optional<awd> at_() {
      return this.c.j();
   }
}
