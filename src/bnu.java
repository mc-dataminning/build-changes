import java.net.SocketAddress;
import jdk.jfr.Category;
import jdk.jfr.DataAmount;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Category({"Minecraft", "Network"})
@StackTrace(false)
@Enabled(false)
public abstract class bnu extends Event {
   @Name("protocolId")
   @Label("Protocol Id")
   public final String protocolId;
   @Name("packetDirection")
   @Label("Packet Direction")
   public final String packetDirection;
   @Name("packetId")
   @Label("Packet Id")
   public final String packetId;
   @Name("remoteAddress")
   @Label("Remote Address")
   public final String remoteAddress;
   @Name("bytes")
   @Label("Bytes")
   @DataAmount
   public final int bytes;

   public bnu(String $$0, String $$1, String $$2, SocketAddress $$3, int $$4) {
      this.protocolId = $$0;
      this.packetDirection = $$1;
      this.packetId = $$2;
      this.remoteAddress = $$3.toString();
      this.bytes = $$4;
   }

   public static final class a {
      public static final String a = "remoteAddress";
      public static final String b = "protocolId";
      public static final String c = "packetDirection";
      public static final String d = "packetId";
      public static final String e = "bytes";

      private a() {
      }
   }
}
