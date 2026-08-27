import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class by extends de<by.a> {
   @Override
   public Codec<by.a> a() {
      return by.a.a;
   }

   public void a(aqi $$0, csz $$1, clv $$2, Collection<csz> $$3) {
      eol $$4 = br.b($$0, (brh)($$2.v() != null ? $$2.v() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bc> b, Optional<ch> c, Optional<bc> d, Optional<ch> e) implements de.a {
      public static final Codec<by.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axh.a(br.b, "player").forGetter(by.a::a),
                  axh.a(ch.a, "rod").forGetter(by.a::b),
                  axh.a(br.b, "entity").forGetter(by.a::c),
                  axh.a(ch.a, "item").forGetter(by.a::d)
               )
               .apply($$0, by.a::new)
      );

      public static an<by.a> a(Optional<ch> $$0, Optional<br> $$1, Optional<ch> $$2) {
         return am.E.a(new by.a(Optional.empty(), $$0, br.a($$1), $$2));
      }

      public boolean a(csz $$0, eol $$1, Collection<csz> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               brh $$4 = $$1.c(erc.a);
               if ($$4 instanceof chr $$5 && this.e.get().a($$5.p())) {
                  $$3 = true;
               }

               for (csz $$6 : $$2) {
                  if (this.e.get().a($$6)) {
                     $$3 = true;
                     break;
                  }
               }

               if (!$$3) {
                  return false;
               }
            }

            return true;
         }
      }

      @Override
      public void a(bd $$0) {
         de.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ch> b() {
         return this.c;
      }

      public Optional<bc> c() {
         return this.d;
      }

      public Optional<ch> d() {
         return this.e;
      }
   }
}
