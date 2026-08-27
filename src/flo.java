import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface flo extends fln {
   static flo.a a(GameProfile $$0, vh $$1, flm $$2) {
      return new flo.a($$0, $$1, $$2);
   }

   static flo.b a(ur $$0, Instant $$1) {
      return new flo.b($$0, $$1);
   }

   ur b();

   default ur c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, vh d, flm e) implements flo {
      public static final Codec<flo.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asq.u.fieldOf("profile").forGetter(flo.a::f), vh.a.forGetter(flo.a::g), flm.d.optionalFieldOf("trust_level", flm.a).forGetter(flo.a::h)
               )
               .apply($$0, flo.a::new)
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
      public fln.a a() {
         return fln.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public vh g() {
         return this.d;
      }

      public flm h() {
         return this.e;
      }
   }

   public static record b(ur c, Instant d) implements flo {
      public static final Codec<flo.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(ut.a.fieldOf("message").forGetter(flo.b::d), asq.m.fieldOf("time_stamp").forGetter(flo.b::e)).apply($$0, flo.b::new)
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
      public fln.a a() {
         return fln.a.b;
      }

      public ur d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
