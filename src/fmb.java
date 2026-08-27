import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fmb extends fma {
   static fmb.a a(GameProfile $$0, vh $$1, flz $$2) {
      return new fmb.a($$0, $$1, $$2);
   }

   static fmb.b a(ur $$0, Instant $$1) {
      return new fmb.b($$0, $$1);
   }

   ur b();

   default ur c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, vh d, flz e) implements fmb {
      public static final Codec<fmb.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asu.u.fieldOf("profile").forGetter(fmb.a::f), vh.a.forGetter(fmb.a::g), flz.d.optionalFieldOf("trust_level", flz.a).forGetter(fmb.a::h)
               )
               .apply($$0, fmb.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public ur b() {
         if (!this.d.n().a()) {
            ur $$0 = this.d.n().b(this.d.b());
            return (ur)($$0 != null ? $$0 : ur.i());
         } else {
            return this.d.c();
         }
      }

      @Override
      public ur c() {
         ur $$0 = this.b();
         ur $$1 = this.i();
         return ur.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public ur d() {
         ur $$0 = this.i();
         return ur.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private ur i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return ur.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fma.a a() {
         return fma.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public vh g() {
         return this.d;
      }

      public flz h() {
         return this.e;
      }
   }

   public static record b(ur c, Instant d) implements fmb {
      public static final Codec<fmb.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(ut.a.fieldOf("message").forGetter(fmb.b::d), asu.m.fieldOf("time_stamp").forGetter(fmb.b::e)).apply($$0, fmb.b::new)
      );

      @Override
      public ur b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fma.a a() {
         return fma.a.b;
      }

      public ur d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
