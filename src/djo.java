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

public class djo extends dey implements dff {
   private static final Codec<ens> f = lp.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ens $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<djo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, djo::new));
   public static final dtb b = dsr.aP;
   protected final ens c;
   private final List<enu> g;
   public static final ewj d = dey.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<je> e = ImmutableList.of(je.a, je.d, je.c, je.f, je.e);

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   protected djo(ens $$0, dsa.d $$1) {
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
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : ewg.a();
   }

   @Override
   protected boolean d_(dsb $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dsb $$0, are $$1, iz $$2, azg $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return false;
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return !this.c.a(awu.b);
   }

   @Override
   protected enu b_(dsb $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dsb $$0, dsb $$1, je $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.a;
   }

   @Override
   protected List<cuo> a(dsb $$0, eqk.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return ewg.a();
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dca)$$1));
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((dca)$$1));
      }
   }

   private boolean a(dbx $$0, iz $$1, dsb $$2) {
      if (this.c.a(awu.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dfa.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            je $$4 = (je)var5.next();
            iz $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(awu.a)) {
               dey $$6 = $$0.b_($$1).b() ? dfa.co : dfa.m;
               $$0.b($$1, $$6.o());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dfa.mW)) {
               $$0.b($$1, dfa.dY.o());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(dby $$0, iz $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b);
   }

   @Override
   public cuo a(@Nullable cmw $$0, dby $$1, iz $$2, dsb $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dfa.a.o(), 11);
         return new cuo(this.c.a());
      } else {
         return cuo.l;
      }
   }

   @Override
   public Optional<avy> ar_() {
      return this.c.j();
   }
}
