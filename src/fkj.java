import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface fkj extends fki {
   static fkj.a a(GameProfile $$0, uy $$1, fkh $$2) {
      return new fkj.a($$0, $$1, $$2);
   }

   static fkj.b a(ui $$0, Instant $$1) {
      return new fkj.b($$0, $$1);
   }

   ui b();

   default ui c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, uy d, fkh e) implements fkj {
      public static final Codec<fkj.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  asg.u.fieldOf("profile").forGetter(fkj.a::f), uy.a.forGetter(fkj.a::g), fkh.d.optionalFieldOf("trust_level", fkh.a).forGetter(fkj.a::h)
               )
               .apply($$0, fkj.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public ui b() {
         if (!this.d.n().a()) {
            ui $$0 = this.d.n().b(this.d.b());
            return (ui)($$0 != null ? $$0 : ui.i());
         } else {
            return this.d.c();
         }
      }

      @Override
      public ui c() {
         ui $$0 = this.b();
         ui $$1 = this.i();
         return ui.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public ui d() {
         ui $$0 = this.i();
         return ui.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private ui i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.d(), ZoneOffset.systemDefault());
         return ui.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fki.a a() {
         return fki.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public uy g() {
         return this.d;
      }

      public fkh h() {
         return this.e;
      }
   }

   public static record b(ui c, Instant d) implements fkj {
      public static final Codec<fkj.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(uk.a.fieldOf("message").forGetter(fkj.b::d), asg.m.fieldOf("time_stamp").forGetter(fkj.b::e)).apply($$0, fkj.b::new)
      );

      @Override
      public ui b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fki.a a() {
         return fki.a.b;
      }

      public ui d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
