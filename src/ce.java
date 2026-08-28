import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class ce extends dz<ce.a> {
   @Override
   public Codec<ce.a> a() {
      return ce.a.a;
   }

   public void a(aro $$0, cxy $$1, cqx $$2, Collection<cxy> $$3) {
      exl $$4 = bx.b($$0, (bvs)($$2.j() != null ? $$2.j() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bi> b, Optional<cv> c, Optional<bi> d, Optional<cv> e) implements dz.a {
      public static final Codec<ce.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  bx.b.optionalFieldOf("player").forGetter(ce.a::a),
                  cv.a.optionalFieldOf("rod").forGetter(ce.a::b),
                  bx.b.optionalFieldOf("entity").forGetter(ce.a::c),
                  cv.a.optionalFieldOf("item").forGetter(ce.a::d)
               )
               .apply($$0, ce.a::new)
      );

      public static aq<ce.a> a(Optional<cv> $$0, Optional<bx> $$1, Optional<cv> $$2) {
         return ap.E.a(new ce.a(Optional.empty(), $$0, bx.a($$1), $$2));
      }

      public boolean a(cxy $$0, exl $$1, Collection<cxy> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               bvs $$4 = $$1.c(faf.a);
               if ($$4 instanceof cmn $$5 && this.e.get().a($$5.f())) {
                  $$3 = true;
               }

               for (cxy $$6 : $$2) {
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
      public void a(bj $$0) {
         dz.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<cv> b() {
         return this.c;
      }

      public Optional<bi> c() {
         return this.d;
      }

      public Optional<cv> d() {
         return this.e;
      }
   }
}
