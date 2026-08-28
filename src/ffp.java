import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.Collection;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public abstract class ffp {
   public boolean a(@Nullable ffp $$0) {
      return $$0 == null ? false : this == $$0;
   }

   public abstract String c();

   public abstract xm d(wy var1);

   public abstract boolean j();

   public abstract boolean i();

   public abstract ffp.b k();

   public abstract n o();

   public abstract Collection<String> h();

   public abstract ffp.b l();

   public abstract ffp.a m();

   public static enum a implements bak {
      a("always", 0),
      b("never", 1),
      c("pushOtherTeams", 2),
      d("pushOwnTeam", 3);

      public static final Codec<ffp.a> e = bak.a(ffp.a::values);
      private static final IntFunction<ffp.a> i = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      public static final yw<ByteBuf, ffp.a> f = yu.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private a(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public wy a() {
         return wy.c("team.collision." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }

   public static enum b implements bak {
      a("always", 0),
      b("never", 1),
      c("hideForOtherTeams", 2),
      d("hideForOwnTeam", 3);

      public static final Codec<ffp.b> e = bak.a(ffp.b::values);
      private static final IntFunction<ffp.b> i = ayc.a($$0 -> $$0.h, values(), ayc.a.a);
      public static final yw<ByteBuf, ffp.b> f = yu.a(i, $$0 -> $$0.h);
      public final String g;
      public final int h;

      private b(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public wy a() {
         return wy.c("team.visibility." + this.g);
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
