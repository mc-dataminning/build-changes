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

public class djp extends dez implements dfg {
   private static final Codec<ent> f = lp.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ent $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<djp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, djp::new));
   public static final dtc b = dss.aP;
   protected final ent c;
   private final List<env> g;
   public static final ewk d = dez.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<je> e = ImmutableList.of(je.a, je.d, je.c, je.f, je.e);

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   protected djp(ent $$0, dsb.d $$1) {
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
   protected ewk b(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ewh.a();
   }

   @Override
   protected boolean d_(dsc $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dsc $$0, arf $$1, iz $$2, azh $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dsc $$0, dbe $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return !this.c.a(awv.b);
   }

   @Override
   protected env b_(dsc $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dsc $$0, dsc $$1, je $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dlf a_(dsc $$0) {
      return dlf.a;
   }

   @Override
   protected List<cup> a(dsc $$0, eql.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ewk a(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return ewh.a();
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcb)$$1));
      }
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dez $$3, iz $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcb)$$1));
      }
   }

   private boolean a(dby $$0, iz $$1, dsc $$2) {
      if (this.c.a(awv.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dfb.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            je $$4 = (je)var5.next();
            iz $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awv.a)) {
               dez $$6 = $$0.b_($$1).b() ? dfb.co : dfb.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dfb.mW)) {
               $$0.b($$1, dfb.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dbz $$0, iz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b);
   }

   @Override
   public cup a(@Nullable cmx $$0, dbz $$1, iz $$2, dsc $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dfb.a.o(), 11);
         return new cup(this.c.a());
      } else {
         return cup.l;
      }
   }

   @Override
   public Optional<avz> ar_() {
      return this.c.j();
   }
}
