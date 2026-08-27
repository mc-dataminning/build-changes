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

public class dgw extends dch implements dco {
   private static final Codec<ekz> f = kt.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof ekz $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dgw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), u()).apply($$0, dgw::new));
   public static final dqi b = dpy.aP;
   protected final ekz c;
   private final List<elb> g;
   public static final etc d = dch.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final ImmutableList<ij> e = ImmutableList.of(ij.a, ij.d, ij.c, ij.f, ij.e);

   @Override
   public MapCodec<dgw> a() {
      return a;
   }

   protected dgw(ekz $$0, dph.d $$1) {
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
   protected etc b(dpi $$0, cym $$1, id $$2, eso $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.c()), $$0.u()) ? d : esz.a();
   }

   @Override
   protected boolean e_(dpi $$0) {
      return $$0.u().f();
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      $$0.u().b($$1, $$2, $$3);
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return false;
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return !this.c.a(avj.b);
   }

   @Override
   protected elb c_(dpi $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean a(dpi $$0, dpi $$1, ij $$2) {
      return $$1.u().a().a(this.c);
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.a;
   }

   @Override
   protected List<crs> a(dpi $$0, enq.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return esz.a();
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((czj)$$1));
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.u().b() || $$2.u().b()) {
         $$3.a($$4, $$0.u().a(), this.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.u().a(), this.c.a((czj)$$1));
      }
   }

   private boolean a(czg $$0, id $$1, dpi $$2) {
      if (this.c.a(avj.b)) {
         boolean $$3 = $$0.a_($$1.d()).a(dcj.dX);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            ij $$4 = (ij)var5.next();
            id $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(avj.a)) {
               dch $$6 = $$0.b_($$1).b() ? dcj.co : dcj.m;
               $$0.b($$1, $$6.n());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dcj.mW)) {
               $$0.b($$1, dcj.dY.n());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(czh $$0, id $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b);
   }

   @Override
   public crs a(@Nullable cka $$0, czh $$1, id $$2, dpi $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dcj.a.n(), 11);
         return new crs(this.c.a());
      } else {
         return crs.i;
      }
   }

   @Override
   public Optional<aun> as_() {
      return this.c.j();
   }
}
