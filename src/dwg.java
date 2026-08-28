import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dwg extends drf implements dup {
   public static final MapCodec<dwg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebv.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.h), t()).apply($$0, dwg::new)
   );
   public static final ebx b = ebw.y;
   public static final ece<ecf> c = ebw.ai;
   public static final ebx d = ebw.A;
   public static final ebx f = ebw.I;
   private static final Map<jc, fgm> g = fgj.d(dne.c(16.0, 13.0, 16.0));
   private final ebv h;

   @Override
   public MapCodec<? extends dwg> a() {
      return a;
   }

   protected dwg(ebv $$0, ebf.d $$1) {
      super($$1.a($$0.g()));
      this.h = $$0;
      this.l(this.C.b().b(e, jc.c).b(b, Boolean.valueOf(false)).b(c, ecf.b).b(d, Boolean.valueOf(false)).b(f, Boolean.valueOf(false)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return g.get($$0.c(b) ? $$0.c(e) : ($$0.c(c) == ecf.a ? jc.a : jc.b));
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return $$0.c(f);
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   protected but a(ebg $$0, djz $$1, iw $$2, crz $$3, ffo $$4) {
      if (!this.h.c()) {
         return but.e;
      } else {
         this.b($$0, $$1, $$2, $$3);
         return but.a;
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, djs $$3, BiConsumer<daa, iw> $$4) {
      if ($$3.g() && this.h.d() && !$$0.c(d)) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void b(ebg $$0, djz $$1, iw $$2, @Nullable crz $$3) {
      ebg $$4 = $$0.a(b);
      $$1.a($$2, $$4, 2);
      if ($$4.c(f)) {
         $$1.a($$2, exr.c, exr.c.a($$1));
      }

      this.a($$3, $$1, $$2, $$4.c(b));
   }

   protected void a(@Nullable crz $$0, djz $$1, iw $$2, boolean $$3) {
      $$1.a($$0, $$2, $$3 ? this.h.k() : this.h.j(), aws.e, 1.0F, $$1.G_().i() * 0.1F + 0.9F);
      $$1.a($$0, $$3 ? egg.h : egg.d, $$2);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$1.D($$2);
         if ($$6 != $$0.c(d)) {
            if ($$0.c(b) != $$6) {
               $$0 = $$0.b(b, Boolean.valueOf($$6));
               this.a(null, $$1, $$2, $$6);
            }

            $$1.a($$2, $$0.b(d, Boolean.valueOf($$6)), 2);
            if ($$0.c(f)) {
               $$1.a($$2, exr.c, exr.c.a($$1));
            }
         }
      }
   }

   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = this.m();
      exq $$2 = $$0.q().b_($$0.a());
      jc $$3 = $$0.k();
      if (!$$0.c() && $$3.o().d()) {
         $$1 = $$1.b(e, $$3).b(c, $$0.l().e - (double)$$0.a().v() > 0.5 ? ecf.a : ecf.b);
      } else {
         $$1 = $$1.b(e, $$0.g().g()).b(c, $$3 == jc.b ? ecf.b : ecf.a);
      }

      if ($$0.q().D($$0.a())) {
         $$1 = $$1.b(b, Boolean.valueOf(true)).b(d, Boolean.valueOf(true));
      }

      return $$1.b(f, Boolean.valueOf($$2.a() == exr.c));
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(e, b, c, d, f);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(f) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$0.c(f)) {
         $$2.a($$3, exr.c, exr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected ebv q() {
      return this.h;
   }
}
