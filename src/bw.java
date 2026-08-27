import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import javax.annotation.Nullable;

public class bw extends dh<bw.a> {
   @Override
   public Codec<bw.a> a() {
      return bw.a.a;
   }

   public void a(aqu $$0, ewu $$1, @Nullable brv $$2) {
      ewu $$3 = $$0.ds();
      erp $$4 = $$2 != null ? bs.b($$0, $$2) : null;
      this.a($$0, $$4x -> $$4x.a($$0.B(), $$1, $$3, $$4));
   }

   public static record a(Optional<bd> b, Optional<cs> c, Optional<bj> d, Optional<bd> e) implements dh.a {
      public static final Codec<bw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(bw.a::a),
                  axu.a(cs.a, "start_position").forGetter(bw.a::b),
                  axu.a(bj.a, "distance").forGetter(bw.a::c),
                  axu.a(bs.b, "cause").forGetter(bw.a::d)
               )
               .apply($$0, bw.a::new)
      );

      public static ao<bw.a> a(bj $$0, bs.a $$1) {
         return an.ae.a(new bw.a(Optional.empty(), Optional.empty(), Optional.of($$0), Optional.of(bs.a($$1))));
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.d(), ".cause");
      }

      public boolean a(aqt $$0, ewu $$1, ewu $$2, @Nullable erp $$3) {
         if (this.c.isPresent() && !this.c.get().a($$0, $$1.c, $$1.d, $$1.e)) {
            return false;
         } else {
            return this.d.isPresent() && !this.d.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e)
               ? false
               : !this.e.isPresent() || $$3 != null && this.e.get().a($$3);
         }
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<cs> b() {
         return this.c;
      }

      public Optional<bj> c() {
         return this.d;
      }

      public Optional<bd> d() {
         return this.e;
      }
   }
}
