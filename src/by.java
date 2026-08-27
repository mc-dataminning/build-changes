import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class by extends df<by.a> {
   @Override
   public Codec<by.a> a() {
      return by.a.a;
   }

   public void a(aqo $$0, ctq $$1, cmm $$2, Collection<ctq> $$3) {
      eph $$4 = br.b($$0, (brw)($$2.v() != null ? $$2.v() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bc> b, Optional<ch> c, Optional<bc> d, Optional<ch> e) implements df.a {
      public static final Codec<by.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  br.b.optionalFieldOf("player").forGetter(by.a::a),
                  ch.a.optionalFieldOf("rod").forGetter(by.a::b),
                  br.b.optionalFieldOf("entity").forGetter(by.a::c),
                  ch.a.optionalFieldOf("item").forGetter(by.a::d)
               )
               .apply($$0, by.a::new)
      );

      public static an<by.a> a(Optional<ch> $$0, Optional<br> $$1, Optional<ch> $$2) {
         return am.E.a(new by.a(Optional.empty(), $$0, br.a($$1), $$2));
      }

      public boolean a(ctq $$0, eph $$1, Collection<ctq> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               brw $$4 = $$1.c(erz.a);
               if ($$4 instanceof cii $$5 && this.e.get().a($$5.p())) {
                  $$3 = true;
               }

               for (ctq $$6 : $$2) {
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
         df.a.super.a($$0);
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
