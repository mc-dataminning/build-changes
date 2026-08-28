import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ch(Optional<bd<cxl.b, ch.a>> c) implements dw<cxl> {
   public static final Codec<ch> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(ch.a.a).optionalFieldOf("modifiers").forGetter(ch::b)).apply($$0, ch::new));

   @Override
   public kp<cxl> a() {
      return kq.n;
   }

   public boolean a(cuo $$0, cxl $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bd<cxl.b, ch.a>> b() {
      return this.c;
   }

   public static record a(Optional<jq<bup>> b, Optional<akq> c, dh.c d, Optional<bus.a> e, Optional<bsy> f) implements Predicate<cxl.b> {
      public static final Codec<ch.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kb.a(lu.c).optionalFieldOf("attribute").forGetter(ch.a::a),
                  akq.a.optionalFieldOf("id").forGetter(ch.a::b),
                  dh.c.d.optionalFieldOf("amount", dh.c.c).forGetter(ch.a::c),
                  bus.a.f.optionalFieldOf("operation").forGetter(ch.a::d),
                  bsy.l.optionalFieldOf("slot").forGetter(ch.a::e)
               )
               .apply($$0, ch.a::new)
      );

      public boolean a(cxl.b $$0) {
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

      public Optional<jq<bup>> a() {
         return this.b;
      }

      public Optional<akq> b() {
         return this.c;
      }

      public dh.c c() {
         return this.d;
      }

      public Optional<bus.a> d() {
         return this.e;
      }

      public Optional<bsy> e() {
         return this.f;
      }
   }
}
