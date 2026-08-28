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

public class djk extends deu implements dfb {
   private static final Codec<eno> f = lp.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof eno $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<djk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, djk::new));
   public static final dsx b = dsn.aP;
   protected final eno c;
   private final List<enq> g;
   public static final ewf d = deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<je> e = ImmutableList.of(je.a, je.d, je.c, je.f, je.e);

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(eno $$0, drw.d $$1) {
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
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ewc.a();
   }

   @Override
   protected boolean d_(drx $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(drx $$0, daz $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return !this.c.a(awr.b);
   }

   @Override
   protected enq b_(drx $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(drx $$0, drx $$1, je $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.a;
   }

   @Override
   protected List<cuk> a(drx $$0, eqg.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return ewc.a();
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dbw)$$1));
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dbw)$$1));
      }
   }

   private boolean a(dbt $$0, iz $$1, drx $$2) {
      if (this.c.a(awr.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dew.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            je $$4 = (je)var5.next();
            iz $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awr.a)) {
               deu $$6 = $$0.b_($$1).b() ? dew.co : dew.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dew.mW)) {
               $$0.b($$1, dew.dY.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dbu $$0, iz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b);
   }

   @Override
   public cuk a(@Nullable cms $$0, dbu $$1, iz $$2, drx $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dew.a.n(), 11);
         return new cuk(this.c.a());
      } else {
         return cuk.l;
      }
   }

   @Override
   public Optional<avv> at_() {
      return this.c.j();
   }
}
