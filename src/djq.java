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

public class djq extends dfa implements dfh {
   private static final Codec<enu> f = lp.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof enu $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<djq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, djq::new));
   public static final dtd b = dst.aP;
   protected final enu c;
   private final List<enw> g;
   public static final ewl d = dfa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<je> e = ImmutableList.of(je.a, je.d, je.c, je.f, je.e);

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   protected djq(enu $$0, dsc.d $$1) {
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
   protected ewl b(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ewi.a();
   }

   @Override
   protected boolean d_(dsd $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dsd $$0, dbf $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return !this.c.a(awv.b);
   }

   @Override
   protected enw b_(dsd $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dsd $$0, dsd $$1, je $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.a;
   }

   @Override
   protected List<cuq> a(dsd $$0, eqm.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return ewi.a();
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcc)$$1));
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dcc)$$1));
      }
   }

   private boolean a(dbz $$0, iz $$1, dsd $$2) {
      if (this.c.a(awv.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dfc.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            je $$4 = (je)var5.next();
            iz $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awv.a)) {
               dfa $$6 = $$0.b_($$1).b() ? dfc.co : dfc.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dfc.mW)) {
               $$0.b($$1, dfc.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dca $$0, iz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b);
   }

   @Override
   public cuq a(@Nullable cmy $$0, dca $$1, iz $$2, dsd $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dfc.a.o(), 11);
         return new cuq(this.c.a());
      } else {
         return cuq.l;
      }
   }

   @Override
   public Optional<avz> ar_() {
      return this.c.j();
   }
}
