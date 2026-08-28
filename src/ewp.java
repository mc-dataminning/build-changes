import com.google.common.collect.Sets;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;

public class ewp {
   private final ews a;
   private final bam b;
   private final jr.a c;
   private final Set<ewp.c<?>> d = Sets.newLinkedHashSet();

   ewp(ews $$0, bam $$1, jr.a $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public boolean a(bbn<?> $$0) {
      return this.a.b().a($$0);
   }

   public <T> T b(bbn<T> $$0) {
      return this.a.b().b($$0);
   }

   @Nullable
   public <T> T c(bbn<T> $$0) {
      return this.a.b().c($$0);
   }

   public void a(alz $$0, Consumer<cxp> $$1) {
      this.a.a($$0, $$1);
   }

   public boolean a(ewp.c<?> $$0) {
      return this.d.contains($$0);
   }

   public boolean b(ewp.c<?> $$0) {
      return this.d.add($$0);
   }

   public void c(ewp.c<?> $$0) {
      this.d.remove($$0);
   }

   public jr.a a() {
      return this.c;
   }

   public bam b() {
      return this.b;
   }

   public float c() {
      return this.a.c();
   }

   public ash d() {
      return this.a.a();
   }

   public static ewp.c<ewu> a(ewu $$0) {
      return new ewp.c<>(ewr.c, $$0);
   }

   public static ewp.c<ezy> a(ezy $$0) {
      return new ewp.c<>(ewr.a, $$0);
   }

   public static ewp.c<eyd> a(eyd $$0) {
      return new ewp.c<>(ewr.b, $$0);
   }

   public static class a {
      private final ews a;
      @Nullable
      private bam b;

      public a(ews $$0) {
         this.a = $$0;
      }

      public ewp.a a(long $$0) {
         if ($$0 != 0L) {
            this.b = bam.a($$0);
         }

         return this;
      }

      public ewp.a a(bam $$0) {
         this.b = $$0;
         return this;
      }

      public ash a() {
         return this.a.a();
      }

      public ewp a(Optional<alz> $$0) {
         ash $$1 = this.a();
         MinecraftServer $$2 = $$1.p();
         bam $$3 = Optional.ofNullable(this.b).or(() -> $$0.map($$1::a)).orElseGet($$1::H_);
         return new ewp(this.a, $$3, $$2.bc().a());
      }
   }

   public static enum b implements bba {
      a("this", ezj.a),
      b("attacker", ezj.d),
      c("direct_attacker", ezj.e),
      d("attacking_player", ezj.b);

      public static final bba.a<ewp.b> e = bba.a(ewp.b::values);
      private final String f;
      private final bbn<? extends bvk> g;

      private b(final String $$0, final bbn<? extends bvk> $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public bbn<? extends bvk> a() {
         return this.g;
      }

      public static ewp.b a(String $$0) {
         ewp.b $$1 = e.a($$0);
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

   public static record c<T>(ewr<T> a, T b) {
   }
}
