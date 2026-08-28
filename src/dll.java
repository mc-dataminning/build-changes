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

public class dll extends dgv implements dhc {
   private static final Codec<epz> f = lu.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof epz $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dll> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dll::new));
   public static final dva b = duq.aP;
   protected final epz c;
   private final List<eqb> g;
   public static final eyx d = dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<jj> e = ImmutableList.of(jj.a, jj.d, jj.c, jj.f, jj.e);

   @Override
   public MapCodec<dll> a() {
      return a;
   }

   protected dll(epz $$0, dtz.d $$1) {
      super($$1);
      this.c = $$0;
      this.g = Lists.newArrayList();
      this.g.add($$0.a(false));

      for (int $$2 = 1; $$2 < 8; $$2++) {
         this.g.add($$0.a(8 - $$2, false));
      }

      this.g.add($$0.a(8, true));
      this.l(this.E.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : eyu.a();
   }

   @Override
   protected boolean f(dua $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      $$0.y().b($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(dua $$0) {
      return false;
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return !this.c.a(awy.b);
   }

   @Override
   protected eqb b_(dua $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(dua $$0, dua $$1, jj $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.a;
   }

   @Override
   protected List<cvl> a(dua $$0, esw.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return eyu.a();
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((ddv)$$1));
      }
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.y().b() || $$2.y().b()) {
         $$3.a($$4, $$0.y().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a((ddv)$$1));
      }
   }

   private boolean a(dds $$0, je $$1, dua $$2) {
      if (this.c.a(awy.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dgx.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jj $$4 = (jj)var5.next();
            je $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awy.a)) {
               dgv $$6 = $$0.b_($$1).b() ? dgx.co : dgx.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dgx.mW)) {
               $$0.b($$1, dgx.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(ddt $$0, je $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b);
   }

   @Override
   public cvl a(@Nullable cnp $$0, ddt $$1, je $$2, dua $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dgx.a.o(), 11);
         return new cvl(this.c.a());
      } else {
         return cvl.k;
      }
   }

   @Override
   public Optional<awc> av_() {
      return this.c.j();
   }
}
