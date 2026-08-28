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

public class dry extends dnc implements dnk {
   private static final Codec<exm> f = mg.c
      .q()
      .comapFlatMap($$0 -> $$0 instanceof exm $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a flowing fluid: " + $$0), $$0 -> $$0);
   public static final MapCodec<dry> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(f.fieldOf("fluid").forGetter($$0x -> $$0x.c), t()).apply($$0, dry::new));
   public static final ece b = ebu.aS;
   protected final exm c;
   private final List<exo> g;
   public static final fgk d = dnc.b(16.0, 0.0, 8.0);
   public static final ImmutableList<jb> e = ImmutableList.of(jb.a, jb.d, jb.c, jb.f, jb.e);

   @Override
   public MapCodec<dry> a() {
      return a;
   }

   protected dry(exm $$0, ebd.d $$1) {
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
   protected fgk b(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$3.a(d, $$2, true) && $$0.c(b) == 0 && $$3.a($$1.b_($$2.d()), $$0.y()) ? d : fgh.a();
   }

   @Override
   protected boolean f(ebe $$0) {
      return $$0.y().f();
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      $$0.y().a($$1, $$2, $$3);
   }

   @Override
   protected boolean e_(ebe $$0) {
      return false;
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return !this.c.a(axj.b);
   }

   @Override
   protected exo b_(ebe $$0) {
      int $$1 = $$0.c(b);
      return this.g.get(Math.min($$1, 8));
   }

   @Override
   protected boolean b(ebe $$0, ebe $$1, jb $$2) {
      return $$1.y().a().a(this.c);
   }

   @Override
   protected dtp a_(ebe $$0) {
      return dtp.a;
   }

   @Override
   protected List<czy> a(ebe $$0, fak.a $$1) {
      return Collections.emptyList();
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return fgh.a();
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if ($$0.y().b() || $$6.y().b()) {
         $$2.a($$3, $$0.y().a(), this.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      if (this.a($$1, $$2, $$0)) {
         $$1.a($$2, $$0.y().a(), this.c.a($$1));
      }
   }

   private boolean a(djx $$0, iv $$1, ebe $$2) {
      if (this.c.a(axj.b)) {
         boolean $$3 = $$0.a_($$1.e()).a(dne.eo);
         UnmodifiableIterator var5 = e.iterator();

         while (var5.hasNext()) {
            jb $$4 = (jb)var5.next();
            iv $$5 = $$1.a($$4.g());
            if ($$0.b_($$5).a(axj.a)) {
               dnc $$6 = $$0.b_($$1).b() ? dne.cy : dne.m;
               $$0.b($$1, $$6.m());
               this.a($$0, $$1);
               return false;
            }

            if ($$3 && $$0.a_($$5).a(dne.nC)) {
               $$0.b($$1, dne.ep.m());
               this.a($$0, $$1);
               return false;
            }
         }
      }

      return true;
   }

   private void a(djy $$0, iv $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }

   @Override
   public czy a(@Nullable bxu $$0, djy $$1, iv $$2, ebe $$3) {
      if ($$3.c(b) == 0) {
         $$1.a($$2, dne.a.m(), 11);
         return new czy(this.c.a());
      } else {
         return czy.k;
      }
   }

   @Override
   public Optional<awo> at_() {
      return this.c.j();
   }
}
