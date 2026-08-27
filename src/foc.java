import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface foc extends fob {
   static foc.a a(GameProfile $$0, vt $$1, foa $$2) {
      return new foc.a($$0, $$1, $$2);
   }

   static foc.b a(vd $$0, Instant $$1) {
      return new foc.b($$0, $$1);
   }

   vd b();

   default vd c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, vt d, foa e) implements foc {
      public static final Codec<foc.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  atq.u.fieldOf("profile").forGetter(foc.a::f), vt.a.forGetter(foc.a::g), foa.d.optionalFieldOf("trust_level", foa.a).forGetter(foc.a::h)
               )
               .apply($$0, foc.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public vd b() {
         if (!this.d.n().a()) {
            vd $$0 = this.d.n().b(this.d.b());
            return (vd)($$0 != null ? $$0 : vd.i());
         } else {
            return this.d.c();
         }
      }

      @Override
      public vd c() {
         vd $$0 = this.b();
         vd $$1 = this.i();
         return vd.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public vd d() {
         vd $$0 = this.i();
         return vd.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private vd i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return vd.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fob.a a() {
         return fob.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public vt g() {
         return this.d;
      }

      public foa h() {
         return this.e;
      }
   }

   public static record b(vd c, Instant d) implements foc {
      public static final Codec<foc.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(vf.a.fieldOf("message").forGetter(foc.b::d), atq.m.fieldOf("time_stamp").forGetter(foc.b::e)).apply($$0, foc.b::new)
      );

      @Override
      public vd b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fob.a a() {
         return fob.a.b;
      }

      public vd d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
