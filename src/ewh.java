import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ewh {
   private final ewk a;
   private final bam b;
   private final jr.a c;
   private final Set<ewh.c<?>> d = Sets.newLinkedHashSet();

   ewh(ewk $$0, bam $$1, jr.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(eza<?> $$0) {
      return this.a.a($$0);
   }

   public <T> T b(eza<T> $$0) {
      return this.a.b($$0);
   }

   public void a(alz $$0, Consumer<cxk> $$1) {
      this.a.a($$0, $$1);
   }

   @Nullable
   public <T> T c(eza<T> $$0) {
      return this.a.d($$0);
   }

   public boolean a(ewh.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ewh.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ewh.c<?> $$0) {
      this.d.remove($$0);
   }

   public jr.a a() {
      return this.c;
   }

   public bam b() {
      return this.b;
   }

   public float c() {
      return this.a.b();
   }

   public ash d() {
      return this.a.a();
   }

   public static ewh.c<ewm> a(ewm $$0) {
      return new ewh.c<>(ewj.c, $$0);
   }

   public static ewh.c<ezs> a(ezs $$0) {
      return new ewh.c<>(ewj.a, $$0);
   }

   public static ewh.c<exv> a(exv $$0) {
      return new ewh.c<>(ewj.b, $$0);
   }

   public static class a {
      private final ewk a;
      @Nullable
      private bam b;

      public a(ewk $$0) {
         this.a = $$0;
      }

      public ewh.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = bam.a($$0);
         }

         return this;
      }

      public ewh.a a(bam $$0) {
         this.b = $$0;
         return this;
      }

      public ash a() {
         return this.a.a();
      }

      public ewh a(Optional<alz> $$0) {
         ash $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         bam $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::H_);
         return new ewh(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bba {
      a("this", ezd.a),
      b("attacker", ezd.d),
      c("direct_attacker", ezd.e),
      d("attacking_player", ezd.b);

      public static final bba.a<ewh.b> e = bba.a(ewh.b::values);
      private final String f;
      private final eza<? extends bvf> g;

      private b(final String $$0, final eza<? extends bvf> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public eza<? extends bvf> a() {
         return this.g;
      }

      public static ewh.b a(String $$0) {
         ewh.b $$1 = e.a($$0);
         if ($$1 != null) {
            return $$1;
         } else {
            throw new IllegalArgumentException("Invalid entity target " + $$0);
         }
      }

      @Override
      public String c() {
         return this.f;
      }
   }

   public static record c<T>(ewj<T> a, T b) {
   }
}
