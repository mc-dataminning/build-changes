import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.Optional;

public class bz extends dh<bz.a> {
   @Override
   public Codec<bz.a> a() {
      return bz.a.a;
   }

   public void a(aqu $$0, cuh $$1, cmn $$2, Collection<cuh> $$3) {
      erp $$4 = bs.b($$0, (brv)($$2.u() != null ? $$2.u() : $$2));
      this.a($$0, $$3x -> $$3x.a($$1, $$4, $$3));
   }

   public static record a(Optional<bd> b, Optional<ci> c, Optional<bd> d, Optional<ci> e) implements dh.a {
      public static final Codec<bz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(bz.a::a),
                  axu.a(ci.a, "rod").forGetter(bz.a::b),
                  axu.a(bs.b, "entity").forGetter(bz.a::c),
                  axu.a(ci.a, "item").forGetter(bz.a::d)
               )
               .apply($$0, bz.a::new)
      );

      public static ao<bz.a> a(Optional<ci> $$0, Optional<bs> $$1, Optional<ci> $$2) {
         return an.E.a(new bz.a(Optional.empty(), $$0, bs.a($$1), $$2));
      }

      public boolean a(cuh $$0, erp $$1, Collection<cuh> $$2) {
         if (this.c.isPresent() && !this.c.get().a($$0)) {
            return false;
         } else if (this.d.isPresent() && !this.d.get().a($$1)) {
            return false;
         } else {
            if (this.e.isPresent()) {
               boolean $$3 = false;
               brv $$4 = $$1.c(eug.a);
               if ($$4 instanceof cig $$5 && this.e.get().a($$5.p())) {
                  $$3 = true;
               }

               for (cuh $$6 : $$2) {
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
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.d, ".entity");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<ci> b() {
         return this.c;
      }

      public Optional<bd> c() {
         return this.d;
      }

      public Optional<ci> d() {
         return this.e;
      }
   }
}
