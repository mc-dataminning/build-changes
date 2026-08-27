import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bk extends dh<bk.a> {
   @Override
   public Codec<bk.a> a() {
      return bk.a.a;
   }

   public void a(aqu $$0, ewu $$1) {
      ewu $$2 = $$0.ds();
      this.a($$0, $$3 -> $$3.a($$0.B(), $$1, $$2));
   }

   public static record a(Optional<bd> b, Optional<cs> c, Optional<bj> d) implements dh.a {
      public static final Codec<bk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  axu.a(bs.b, "player").forGetter(bk.a::a), axu.a(cs.a, "start_position").forGetter(bk.a::b), axu.a(bj.a, "distance").forGetter(bk.a::c)
               )
               .apply($$0, bk.a::new)
      );

      public static ao<bk.a> a(bs.a $$0, bj $$1, cs.a $$2) {
         return an.X.a(new bk.a(Optional.of(bs.a($$0)), Optional.of($$2.b()), Optional.of($$1)));
      }

      public static ao<bk.a> a(bs.a $$0, bj $$1) {
         return an.Y.a(new bk.a(Optional.of(bs.a($$0)), Optional.empty(), Optional.of($$1)));
      }

      public static ao<bk.a> a(bj $$0) {
         return an.D.a(new bk.a(Optional.empty(), Optional.empty(), Optional.of($$0)));
      }

      public boolean a(aqt $$0, ewu $$1, ewu $$2) {
         return this.c.isPresent() && !this.c.get().a($$0, $$1.c, $$1.d, $$1.e)
            ? false
            : !this.d.isPresent() || this.d.get().a($$1.c, $$1.d, $$1.e, $$2.c, $$2.d, $$2.e);
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
   }
}
