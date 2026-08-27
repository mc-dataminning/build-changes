import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.UUID;

public interface frv extends fru {
   static frv.a a(GameProfile $$0, wi $$1, frt $$2) {
      return new frv.a($$0, $$1, $$2);
   }

   static frv.b a(vs $$0, Instant $$1) {
      return new frv.b($$0, $$1);
   }

   vs b();

   default vs c() {
      return this.b();
   }

   boolean a(UUID var1);

   public static record a(GameProfile c, wi d, frt e) implements frv {
      public static final Codec<frv.a> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  avu.v.fieldOf("profile").forGetter(frv.a::f), wi.a.forGetter(frv.a::g), frt.d.optionalFieldOf("trust_level", frt.a).forGetter(frv.a::h)
               )
               .apply($$0, frv.a::new)
      );
      private static final DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

      @Override
      public vs b() {
         if (!this.d.o().a()) {
            vs $$0 = this.d.o().b(this.d.c());
            return (vs)($$0 != null ? $$0 : vs.i());
         } else {
            return this.d.d();
         }
      }

      @Override
      public vs c() {
         vs $$0 = this.b();
         vs $$1 = this.i();
         return vs.a("gui.chatSelection.message.narrate", this.c.getName(), $$0, $$1);
      }

      public vs d() {
         vs $$0 = this.i();
         return vs.a("gui.chatSelection.heading", this.c.getName(), $$0);
      }

      private vs i() {
         LocalDateTime $$0 = LocalDateTime.ofInstant(this.d.e(), ZoneOffset.systemDefault());
         return vs.b($$0.format(f)).a(n.u, n.h);
      }

      @Override
      public boolean a(UUID $$0) {
         return this.d.a($$0);
      }

      public UUID e() {
         return this.c.getId();
      }

      @Override
      public fru.a a() {
         return fru.a.a;
      }

      public GameProfile f() {
         return this.c;
      }

      public wi g() {
         return this.d;
      }

      public frt h() {
         return this.e;
      }
   }

   public static record b(vs c, Instant d) implements frv {
      public static final Codec<frv.b> b = RecordCodecBuilder.create(
         $$0 -> $$0.group(vu.a.fieldOf("message").forGetter(frv.b::d), avu.n.fieldOf("time_stamp").forGetter(frv.b::e)).apply($$0, frv.b::new)
      );

      @Override
      public vs b() {
         return this.c;
      }

      @Override
      public boolean a(UUID $$0) {
         return false;
      }

      @Override
      public fru.a a() {
         return fru.a.b;
      }

      public vs d() {
         return this.c;
      }

      public Instant e() {
         return this.d;
      }
   }
}
