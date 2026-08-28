import com.google.common.collect.Lists;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ffd extends ffv implements ffp {
   @SerializedName("pingResults")
   public List<ffq> a = Lists.newArrayList();
   @SerializedName("worldIds")
   public List<Long> b = Lists.newArrayList();
}
