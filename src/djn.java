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

public class djn extends dex implements dfe {
   private static final Codec<enr> f = lp.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof enr $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<djn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, djn::new));
   public static final dta b = dsq.aP;
   protected final enr c;
   private final List<ent> g;
   public static final ewi d = dex.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<je> e = ImmutableList.of(je.a, je.d, je.c, je.f, je.e);

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   protected djn(enr $$0, drz.d $$1) {
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
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ewf.a();
   }

   @Override
   protected boolean d_(dsa $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return !this.c.a(awu.b);
   }

   @Override
   protected ent b_(dsa $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dsa $$0, dsa $$1, je $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dld a_(dsa $$0) {
      return dld.a;
   }

   @Override
   protected List<cun> a(dsa $$0, eqj.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return ewf.a();
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dbz)$$1));
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dbz)$$1));
      }
   }

   private boolean a(dbw $$0, iz $$1, dsa $$2) {
      if (this.c.a(awu.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dez.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            je $$4 = (je)var5.next();
            iz $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awu.a)) {
               dex $$6 = $$0.b_($$1).b() ? dez.co : dez.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dez.mW)) {
               $$0.b($$1, dez.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dbx $$0, iz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b);
   }

   @Override
   public cun a(@Nullable cmv $$0, dbx $$1, iz $$2, dsa $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dez.a.o(), 11);
         return new cun(this.c.a());
      } else {
         return cun.l;
      }
   }

   @Override
   public Optional<avy> as_() {
      return this.c.j();
   }
}
