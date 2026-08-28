import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ch(Optional<bd<cyg.b, ch.a>> c) implements dw<cyg> {
   public static final Codec<ch> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(ch.a.a).optionalFieldOf("modifiers").forGetter(ch::b)).apply($$0, ch::new));

   @Override
   public kq<cyg> a() {
      return kr.n;
   }

   public boolean a(cvl $$0, cyg $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bd<cyg.b, ch.a>> b() {
      return this.c;
   }

   public static record a(Optional<jr<bvh>> b, Optional<alb> c, dh.c d, Optional<bvk.a> e, Optional<bts> f) implements Predicate<cyg.b> {
      public static final Codec<ch.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kc.a(lv.c).optionalFieldOf("attribute").forGetter(ch.a::a),
                  alb.a.optionalFieldOf("id").forGetter(ch.a::b),
                  dh.c.d.optionalFieldOf("amount", dh.c.c).forGetter(ch.a::c),
                  bvk.a.f.optionalFieldOf("operation").forGetter(ch.a::d),
                  bts.l.optionalFieldOf("slot").forGetter(ch.a::e)
               )
               .apply($$0, ch.a::new)
      );

      public boolean a(cyg.b $$0) {
         if (this.b.isPresent() && !this.b.get().a($$0.a())) {
            return false;
         } else if (this.c.isPresent() && !this.c.get().equals($$0.b().b())) {
            return false;
         } else if (!this.d.d($$0.b().c())) {
            return false;
         } else {
            return this.e.isPresent() && this.e.get() != $$0.b().d() ? false : !this.f.isPresent() || this.f.get() == $$0.c();
         }
      }

      public Optional<jr<bvh>> a() {
         return this.b;
      }

      public Optional<alb> b() {
         return this.c;
      }

      public dh.c c() {
         return this.d;
      }

      public Optional<bvk.a> d() {
         return this.e;
      }

      public Optional<bts> e() {
         return this.f;
      }
   }
}
