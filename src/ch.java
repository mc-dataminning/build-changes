import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record ch(Optional<bd<cxn.b, ch.a>> c) implements dw<cxn> {
   public static final Codec<ch> a = RecordCodecBuilder.create($$0 -> $$0.group(bd.a(ch.a.a).optionalFieldOf("modifiers").forGetter(ch::b)).apply($$0, ch::new));

   @Override
   public kp<cxn> a() {
      return kq.n;
   }

   public boolean a(cuq $$0, cxn $$1) {
      return !this.c.isPresent() || this.c.get().a($$1.b());
   }

   public Optional<bd<cxn.b, ch.a>> b() {
      return this.c;
   }

   public static record a(Optional<jq<bur>> b, Optional<akr> c, dh.c d, Optional<buu.a> e, Optional<bsz> f) implements Predicate<cxn.b> {
      public static final Codec<ch.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  kb.a(lu.c).optionalFieldOf("attribute").forGetter(ch.a::a),
                  akr.a.optionalFieldOf("id").forGetter(ch.a::b),
                  dh.c.d.optionalFieldOf("amount", dh.c.c).forGetter(ch.a::c),
                  buu.a.f.optionalFieldOf("operation").forGetter(ch.a::d),
                  bsz.l.optionalFieldOf("slot").forGetter(ch.a::e)
               )
               .apply($$0, ch.a::new)
      );

      public boolean a(cxn.b $$0) {
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

      public Optional<jq<bur>> a() {
         return this.b;
      }

      public Optional<akr> b() {
         return this.c;
      }

      public dh.c c() {
         return this.d;
      }

      public Optional<buu.a> d() {
         return this.e;
      }

      public Optional<bsz> e() {
         return this.f;
      }
   }
}
